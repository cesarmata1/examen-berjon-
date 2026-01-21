package es.upsa.dasi.examen.backend.infraestructure;
import es.upsa.dasi.examen.backend.adapters.output.persistence.Dao;
import es.upsa.dasi.examen.domain.entities.Customer;
import es.upsa.dasi.examen.domain.exceptions.ExamenException;
import es.upsa.dasi.examen.domain.exceptions.ExamenSqlException;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class DaoImpl implements Dao {

    @Inject
    DataSource dataSource;

    final String SQL = """
                       SELECT c.id,c.name,c.email,c.bonus
                       FROM customers c
                       """;

    List <Customer> customers = new ArrayList<>();

    @Override
    public List<Customer> findAll() throws ExamenException {
        try (Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(SQL)){
            while (resultSet.next()) {
                customers.add(toCustomer(resultSet));
            }

        }catch (SQLException e){
            throw toExamenException(e);
        }
        return customers;
    }

    private Customer toCustomer(ResultSet resultSet) throws SQLException {
        return Customer.builder()
                .withId(resultSet.getString(1))
                .withName(resultSet.getString(2))
                .withEmail(resultSet.getString(3))
                .withBonus(resultSet.getFloat(4))
                .build();
    }

    private ExamenException toExamenException (SQLException sqlException) {
        return new ExamenSqlException(sqlException);
    }
}
