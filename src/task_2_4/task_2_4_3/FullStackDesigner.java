package Netologia.task_2_4.task_2_4_3;

public class FullStackDesigner extends Student implements Engineer {

    public FullStackDesigner(){
        super();
    }

    public FullStackDesigner(int level){
        super(level);
    }

    @Override
    public void knowledgeInCss(int level) {
    }

    @Override
    public void knowledgeInDataBase(int level) {
        System.out.println("does he need it?");
    }

    @Override
    public void knowledgeInHtml(int level) {
        knowledgeInDataBase(0);
    }
}
