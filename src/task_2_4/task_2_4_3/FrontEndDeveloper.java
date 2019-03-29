package Netologia.task_2_4.task_2_4_3;

public class FrontEndDeveloper extends Student implements Engineer {
    @Override
    public void knowledgeInCss(int level) {

    }

    @Override
    public void knowledgeInDataBase(int level) {

    }

    @Override
    public void knowledgeInHtml(int level) {
        throw new IllegalArgumentException("Тут нет уровня!");
    }
}
