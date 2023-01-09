package homework3;
/*
        сломанный лифт
        лифт, находящийся на первом этаже здания высотой H, должен подняться на последний этаж.
        Лифт сломан.
        Каждый раз он поднимается на N этажей и спускается на M этажей.
        Если на последнем подьеме лифт превысил колличество этажей,
        то считается что лифт поднялся на самый верх.

        Найдите количество подьемов, которые понадобятся лифту.
        реализовать метод numberOfLifts(int floor, int stepUp, int stepDown)
*/
public class BrokenLift {
  private int floors;
  private int stepUp;
  private int stepDown;

  public void setFloors(int floors) {
    this.floors = floors;
  }

  public void setStepUp(int stepUp) {
    this.stepUp = stepUp;
  }

  public void setStepDown(int stepDown) {
    this.stepDown = stepDown;
  }

  public int getFloors() {
    return floors;
  }

  public int getStepUp() {
    return stepUp;
  }

  public int getStepDown() {
    return stepDown;
  }

  public int numberOfLifts(int floors, int stepUp, int stepDown){
    int result = 0;
    int stepFloors = 0;

    while (stepFloors < floors) {
      stepFloors += stepUp - stepDown;
      result++;
    }

    return result;
  }

  public int numberOfLifts(){
    int result = 0;
    for (int stepFloors = 0; stepFloors < floors; stepFloors += stepUp - stepDown){
      result++;
    }
    return result;
  }
}
