package pattern.creational.builder;

public class Client {
    public static void main (String[] args){
        QueryBuilderDirector director = new QueryBuilderDirector();
        String from = "table";
        String where = "name";

        QueryBuilder builder = new DataSource1QueryBuilder();
        Query query = director.buildQuery(from,where,builder);
        query.execute();

        builder = new DataSource2QueryBuilder();
        query =  director.buildQuery(from,where,builder);
        query.execute();
    }
}
