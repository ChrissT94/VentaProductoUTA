package org.uta.ventas.service;

import java.util.List;

import javax.jws.WebService;

import org.uta.ventas.model.Producto;
import org.uta.ventas.repository.ProductoRepository;
import org.uta.ventas.repository.ProductoRepositoryImpl;

@WebService(endpointInterface = "org.uta.ventas.service.ProductoService")
public class ProductoServiceImpl implements ProductoService {

	ProductoRepository productoRepository = new ProductoRepositoryImpl();
	
	@Override
	public Producto crearProducto(Producto producto) {
		// TODO Auto-generated method stub
		return productoRepository.crearProducto(producto);
	}

	@Override
	public List<Producto> obtenerTodas() {
		// TODO Auto-generated method stub
		return productoRepository.obtenerTodas();
	}

}
