package item2;

/**
 * 자바빈즈 패턴 - 일관성이 깨지고, 불변으로 만들 수 없다.
 * <p>
 * 점층적 생성자 패턴도 쓸 수는 있지만, 매개변수 개수가 많아지면 클라이언트 코드를 작성하거나 읽기 어렵다.
 */
public class NutritionFactsByJavaBeans {
    // 매개변수들은 (기본값이 있다면) 기본값으로 초기화된다.
    private int servingSize = -1;
    private int servings = -1;
    private int calories = 0;
    private int fat = 0;
    private int sodium = 0;
    private int carbohydrate = 0;

    public NutritionFactsByJavaBeans() {
    }

    // 세터 메서드들
    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }

    public void setServings(int servings) {
        this.servings = servings;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setFat(int fat) {
        this.fat = fat;
    }

    public void setSodium(int sodium) {
        this.sodium = sodium;
    }

    public void setCarbohydrate(int carbohydrate) {
        this.carbohydrate = carbohydrate;
    }

    public static void main(String[] args) {
        NutritionFactsByJavaBeans nutritionFactsByJavaBeans = new NutritionFactsByJavaBeans();
        nutritionFactsByJavaBeans.setServingSize(240);
        nutritionFactsByJavaBeans.setServingSize(8);
        nutritionFactsByJavaBeans.setServingSize(100);
        nutritionFactsByJavaBeans.setServingSize(35);
        nutritionFactsByJavaBeans.setServingSize(27);
    }
}
