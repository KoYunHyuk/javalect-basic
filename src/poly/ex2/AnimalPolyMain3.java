package poly.ex2;

public class AnimalPolyMain3 {

    public static void main(String[] args) {
        // Ctrl + Alt + N : dog -> new Dog()
        Animal[] animalArr = {new Dog(), new Cat(), new Caw(), new Duck(), new Pig()};

        // 변하지 않는 부분
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    // 동물이 추가되어도 변하지 않는 부분
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료\n");
    }
}
