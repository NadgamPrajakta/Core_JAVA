package intermediatary_ops;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Custom_26 {

    public static void main(String[] args) {

        List<Developer> developers = new ArrayList<>();

        developers.add(new Developer("Amit", List.of("Java", "Spring")));
        developers.add(new Developer("Pooja", List.of("Python", "Django")));
        developers.add(new Developer("Ravi", List.of("JavaScript", "React")));

        developers.stream()
            .flatMap(new SkillExtractor())
            .forEach(new SkillPrinter());
    }
}

class Developer {
    String name;
    List<String> skills;

    Developer(String name, List<String> skills) {
        this.name = name;
        this.skills = skills;
    }
}

class SkillExtractor implements Function<Developer, java.util.stream.Stream<String>> {
    public java.util.stream.Stream<String> apply(Developer d) {
        return d.skills.stream();
    }
}

class SkillPrinter implements java.util.function.Consumer<String> {
    public void accept(String skill) {
        System.out.println("Skill: " + skill);
    }
}
