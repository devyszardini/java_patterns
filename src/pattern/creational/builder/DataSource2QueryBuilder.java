package pattern.creational.builder;

/**
 * Created by devys on 22/05/16.
 */
public class DataSource2QueryBuilder implements QueryBuilder{
    private DataSource2Query query = new DataSource2Query();

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
