/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alertsAndInformations;

import javax.swing.JOptionPane;

/**
 *
 * @author Grześ
 */
public class AlertsAndDescribes {
    
      public void alertNegativeNumber() {
        JOptionPane.showMessageDialog(null, "Podałeś wartość ujemną ! ", "Błąd", JOptionPane.WARNING_MESSAGE);
    }

    public void alertLetterInsteadOfNumber() {
        JOptionPane.showMessageDialog(null, "Wprowadź poprawną wartość/Wypełnij potrzebne pola ! ", "Błąd", JOptionPane.WARNING_MESSAGE);
    }

    public void alertTraingleNotExists() {
        JOptionPane.showMessageDialog(null, "Podane długości boków, nie spałniają warunków istnienia trójkąta! \n Każdy bok trójkąta jest mniejszy od sumy dwóch pozostałych boków", "Błąd", JOptionPane.WARNING_MESSAGE);
    }

    public void AboutProject() {
        JOptionPane.showMessageDialog(null, "Program \"2DFigures\" służący do obliczenia pól oraz obwodów figur płaskich. \nAutor: Grzegorz Filewicz \nData stworzenia programu: 12.10.2017","O Programie",JOptionPane.INFORMATION_MESSAGE);
    }

    public void AboutAuthor() {
        JOptionPane.showMessageDialog(null, "Grzegorz Filewicz \nLublin 10.10.2017", "O Autorze", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
}
