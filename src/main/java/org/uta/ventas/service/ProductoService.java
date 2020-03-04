package org.uta.ventas.service;

import java.util.List;

import javax.jws.WebService;

import org.uta.ventas.model.Producto;

@WebService
public interface ProductoService {

	/**
	 * M�todo para crear un producto
	 * @param producto
	 * @return
	 */
	Producto crearProducto(Producto producto);
	
	/**
	 * M�todo para obtener todos los productos
	 * @return
	 */
	List<Producto> obtenerTodas();
}
