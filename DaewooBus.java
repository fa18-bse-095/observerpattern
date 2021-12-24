/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelling;

import static java.nio.file.Files.list;
import static java.rmi.Naming.list;
import java.util.ArrayList;
import static java.util.Collections.list;

/**
 *
 * @author fa18-bse-078
 */
public abstract class DaewooBus implements Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int State;
    private int state;
    public int getState(){
        return State;
    }
    public void setState(int state){
    this.state=state;
    notifyallObservers();
    }
    public void attach(Observer observer){
    observers.add(observer);
    }

    private void notifyallObservers() {
      for(Observer observer : observers){
      observer.update();
      }
    }
}
