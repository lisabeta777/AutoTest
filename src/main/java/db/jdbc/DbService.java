package db.jdbc;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbService {

    public static int count(final String sql) {
        int value = 0;

        Connection connection = new DbClient().getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                value = resultSet.getInt("count(*)");
            }
            connection.close();
        } catch (SQLException e) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        }
        return value;
    }

    public static int getNumberUpdate(final int id) {
        Connection connection = new DbClient().getConnection();
        int resultSet = 0;
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeUpdate("INSERT INTO public.animal "
                    + "(id, \"name\", age, \"type\", sex, place) VALUES(" + id + ", 'Катя', 2, 1, 1, 1)");
            connection.close();
        } catch (
                SQLException e) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        }
        return resultSet;
    }

    public static int getSQL(final String sql) {
        Connection connection = new DbClient().getConnection();
        int resultSet = 0;
        try {
            Statement statement = connection.createStatement();
            resultSet = statement.executeUpdate(sql);
            connection.close();
        } catch (
                SQLException e) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        }
        return resultSet;
    }

    public static String executeQueryGetName(final String column, final String sql) {
        String value = "";
        Connection connection = new DbClient().getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                value = resultSet.getString(column);
            }
            connection.close();
        } catch (SQLException e) {
            try {
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        }
        return value;
    }
}
