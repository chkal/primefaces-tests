package de.chkal.primefaces;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.event.FileUploadEvent;

@ManagedBean
@RequestScoped
public class UploadBean {
  
  public void onUpload(FileUploadEvent event) {
    System.out.println("-------> "+event.getFile().getFileName());
  }

}
