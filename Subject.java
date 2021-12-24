/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelling;

/**
 *
 * @author fa18-bse-078
 */
public interface Subject {
    public void attach(Observer V);
    public void detach(Observer V);
    public void notifys();
}
