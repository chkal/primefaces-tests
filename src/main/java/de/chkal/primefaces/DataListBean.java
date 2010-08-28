package de.chkal.primefaces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="dataListBean")
@ViewScoped
public class DataListBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Book> data = new ArrayList<Book>();

	public DataListBean() {
		data.add( new Book("Book 1"));
		data.add( new Book("Book 2"));
		data.add( new Book("Book 3"));
	}

	public List<Book> getData() {
		return data;
	}
}
