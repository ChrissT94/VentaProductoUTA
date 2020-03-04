package org.uta.ventas.repository;

import java.util.List;

import org.uta.ventas.model.Producto;

public interface ProductoRepository {

	/**
	 * Método para crear un producto
	 * @param producto
	 * @return
	 */
	Producto crearProducto(Producto producto);
	
	/**
	 * Método para obtener todos los productos
	 * @return
	 */
	List<Producto> obtenerTodas();
}
