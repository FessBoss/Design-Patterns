package Example1;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://github.com/FessBoss/Design-Patterns");
        project.run();
    }
}
