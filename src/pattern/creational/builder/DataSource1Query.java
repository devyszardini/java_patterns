package pattern.creational.builder;

/**
 * Created by devys on 22/05/16.
 */
public class DataSource1Query implements Query {

    private String from;
    private String where;

    @Override
    public void execute() {
        System.out.println("executing data source quesry 1 from "+from+" where "+where);
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public void setFrom(String from) {
        this.from = from;
    }
}
