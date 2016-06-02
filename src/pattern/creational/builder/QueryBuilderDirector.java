package pattern.creational.builder;

/**
 * Created by devys on 22/05/16.
 */
public class QueryBuilderDirector {
    public Query buildQuery(String from,String where, QueryBuilder builder){

        builder.from(from);

        builder.where(where);

        return builder.getQuery();
    }
}
