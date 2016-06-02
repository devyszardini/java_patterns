package pattern.creational.builder;

/**
 * Created by devys on 22/05/16.
 */
public class DataSource1QueryBuilder implements QueryBuilder {

    private DataSource1Query query = new DataSource1Query();

    @Override
    public void from(String from) {
        query.setFrom(from);
    }

    @Override
    public void where(String where) {
        query.setWhere(where);
    }

    @Override
    public Query getQuery() {
        return query;
    }
}
