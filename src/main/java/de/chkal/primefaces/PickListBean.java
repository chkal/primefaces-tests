package de.chkal.primefaces;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.model.DualListModel;

@ManagedBean(name="pickListBean")
@RequestScoped
public class PickListBean {

  private DualListModel<String> model = new DualListModel<String>();

  private final SecureRandom random = new SecureRandom();

  public PickListBean() {
    model.setSource( Arrays.asList(
        "Test"+random.nextInt(10), 
        "Test"+random.nextInt(10), 
        "Test"+random.nextInt(10)
    ));
    model.setTarget( new ArrayList<String>() );
  }

  public String getCurrentDate() {
    return new Date().toString();
  }

  public DualListModel<String> getModel() {
    return model;
  }

  public void setModel(DualListModel<String> model) {
    this.model = model;
  }

}
