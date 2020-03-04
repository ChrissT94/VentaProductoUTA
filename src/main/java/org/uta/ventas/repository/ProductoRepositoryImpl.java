package org.uta.ventas.repository;

import java.util.ArrayList;
import java.util.List;

import org.uta.ventas.model.Producto;

public class ProductoRepositoryImpl implements ProductoRepository{

	private static List<Producto> ventaProducto= new ArrayList<Producto>();
			
	@Override
	public Producto crearProducto(Producto producto) {
		// TODO Auto-generated method stub
		System.out.println("Crear Producto....");
		ventaProducto.add(producto);
		return producto;
	}

	@Override
	public List<Producto> obtenerTodas() {
		// TODO Auto-generated method stub
		System.out.println("Obtener todas los productos");
		return ventaProducto;
	}

	
}
