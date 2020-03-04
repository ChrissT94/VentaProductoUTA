package org.uta.ventas.repository;

import java.util.List;

import org.uta.ventas.model.Producto;

public interface ProductoRepository {

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
