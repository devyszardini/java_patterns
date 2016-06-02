package pattern.creational.builder;

/**
 * Created by devys on 22/05/16.
 */
public interface QueryBuilder {
    void from(String from);

    void where(String where);

    Query getQuery();
}
