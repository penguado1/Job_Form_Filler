import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.PopupMenu;
import java.sql.Ref;

import javax.swing.*;
import javax.swing.border.Border;

public class UserMenu extends JMenuBar{
    
    private JMenu Profile;
    private JMenuItem PersDetails;
    private JMenuItem EmploymentHis;
    private JMenuItem EducAndQual;
    private JMenuItem References;


    UserMenu(){
      customiseMenu();

      createProfile();

      createPersDetails();
      addItemSeperator();

      createEmploymentHis();
      addItemSeperator();

      createEducAndQual();
      addItemSeperator();

      createReferences();

      this.add(Profile);
    }

    private void createPersDetails(){
      PersDetails = new JMenuItem("Personal Details");
      setItemBorder(PersDetails);

      Profile.add(PersDetails);
    }

    private void createEmploymentHis(){
      EmploymentHis = new JMenuItem("Employment History");
      setItemBorder(EmploymentHis);

      Profile.add(EmploymentHis);
    }

    private void createEducAndQual(){
      EducAndQual = new JMenuItem("Education and Qualifactions");
      setItemBorder(EducAndQual);

      Profile.add(EducAndQual);
    }

    private void createReferences(){
      References = new JMenuItem("Reference's");
      setItemBorder(References);

      Profile.add(References);
    }

     private void createProfile(){
      Profile = new JMenu("Profile");

      Profile.setFont(new Font("Arial", Font.BOLD, 25));
      Profile.setOpaque(true);
      Profile.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
      Profile.setBackground(Color.decode("#5b5b5c"));
      Profile.setForeground(Color.decode("#d5d7d9"));

      JPopupMenu popup = Profile.getPopupMenu();
      popup.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createLineBorder(Color.gray, 3),
        BorderFactory.createEmptyBorder(5, 8, 5, 8)
      ));

    }
    

    private void customiseMenu(){

      Font f = new Font("Arial", Font.BOLD, 17);
      UIManager.put("MenuItem.font", f);

      this.add(Box.createHorizontalGlue());
    }

    private void addItemSeperator(){
      JPanel Separator = new JPanel();
      Separator.setBackground(Color.decode("#5b5b5c"));
      Separator.setPreferredSize(new Dimension(Separator.getWidth(), 2));

      Profile.add(Separator);
    }

    private void setItemBorder(JMenuItem item){
      item.setBorder(BorderFactory.createEmptyBorder(20, 5, 20, 5));
    }
}
