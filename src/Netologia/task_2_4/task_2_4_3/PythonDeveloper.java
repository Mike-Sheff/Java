package Netologia.task_2_4.task_2_4_3;

public class PythonDeveloper extends Student implements Engineer{

    public PythonDeveloper(){
        super();
    }

    @Override
    public void knowledgeInCss(int level) {

    }

    @Override
    public void knowledgeInDataBase(int level) {

    }

    @Override
    public void knowledgeInHtml(int level) {
        switch (level){
            case 3:
                System.out.println("First level");
                break;
            case 2:
                System.out.println("Second level");
                break;
            case 1:
                System.out.println("Third level");
                break;
        }
    }
}
