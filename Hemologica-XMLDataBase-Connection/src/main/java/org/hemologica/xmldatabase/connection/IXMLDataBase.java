package org.hemologica.xmldatabase.connection;

import java.io.File;
import java.util.List;

import org.hemologica.xmldatabase.exceptions.XMLDataBaseException;

/**
 * @author Paula Roche
 */
public interface IXMLDataBase {
	
	
	/**
	 * Agrega Elemento en la base de datos
	 * @param element
	 */
	public void addElement(File element);
	
	/**
	 * Agrega Elemento en la base de datos
	 * @param dataBase
	 * @param path Ruta del elemento a agregar
	 * @throws XMLDataBaseException 
	 */
	public void addElement(String path) throws XMLDataBaseException;
	
	/**
	 * Borra Elemento en la base de datos
	 * @param element
	 */
	public void removeElement(File element);
	
	/**
	 * Borra Elemento en la base de datos
	 * @param name nombre del documento a eliminar
	 * @throws XMLDataBaseException 
	 */
	public void removeElement(String name) throws XMLDataBaseException;
	
	/**
	 * Actualiza Elemento en la base de datos
	 * @param element
	 */
	public void updateElement(String nameOldElement, File newElement);
	
	/**
	 * Actualiza Elemento en la base de datos
	 * @param nameOldElement Nombre del elemento a actualizar.
	 * @param pathNewElement Ruta al elemento por el cual se va a sustituir
	 * @throws XMLDataBaseException 
	 */
	public void updateElement(String nameOldElement, String pathNewElement) throws XMLDataBaseException;
	
	/**
	 * Devuelve el elemento pasado por parametro
	 * @param path
	 */
	public void getElement(File element);
	
	/**
	 * Devuelve el elemento pasado por parametro
	 * @param name nombre del elemento a devolver
	 * @throws XMLDataBaseException 
	 */
	public String getElement(String name) throws XMLDataBaseException;
	
	/**
	 * Devuelve todos los elementos de una persona segun su id.
	 * @param patientId
	 * @return
	 * @throws XMLDataBaseException
	 */
	public List<String> getElementPatientId(String patientId) throws XMLDataBaseException;
	
	/**
	 * Devulve el Cda con identificacion la pasa por parametro
	 * @param patientId
	 * @return
	 * @throws XMLDataBaseException
	 */
	public String getElementCDAId(String root, String extention) throws XMLDataBaseException;
	
}
