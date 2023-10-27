package racingcar.domain;

public class Car {
    private static final String LENGTH_ERROR_MESSAGE = "자동차 이름은 5글자 이하만 가능합니다.";
    private String name;
    private int position = 0;


    private Car(String name) {
        validateLength(name);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPosition() {
        return position;
    }

    public static Car getNewCar(String name) {
        return new Car(name);
    }

    private void validateLength(String name) {
        if(name.length() > 5){
            throw new IllegalArgumentException(LENGTH_ERROR_MESSAGE);
        }
    }
}
