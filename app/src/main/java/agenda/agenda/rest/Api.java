package agenda.agenda.rest;


import agenda.agenda.rest.model.Hijo;
import agenda.agenda.rest.model.Respuesta;
import agenda.agenda.rest.model.RespuestaNotificaciones;
import agenda.agenda.rest.model.Usuario;
import agenda.agenda.rest.model.Vacuna;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface Api {


    @POST("usuarios/verificar-usuario")
    Call<Respuesta<Usuario>>  getUsuario(@Query("correo") String correo);

    @POST("hijos/obtener-por-padre")
    Call<List<Hijo>> getHijos(@Query("idPadre") String idPadre);

    @POST("vacunas/obtener-por-hijo")
    Call<List<Vacuna>> getVacunasHijos(@Query("idHijo") String idHijo);

    @POST("hijos/enviar-notificaciones")
    Call<RespuestaNotificaciones<Hijo>> enviarNotificaciones(@Query("idPadre") String idPadre);

/*
    @GET("ProductosCanjeables/")
    Call<Respuesta<py.com.copetrol.rest.model.ProductoCanjeable>> getProductosCanjeables();

    @GET("PuntosObject/")
    Call<Respuesta<py.com.copetrol.rest.model.Punto>> getPuntos();

    @GET("Mantenimiento/")
    Call<Respuesta<Mantenimiento>> getMantenimiento();

    @POST("Mantenimiento/")
    Call<Mantenimiento> agregarMantenimiento(@Body Mantenimiento datos);

    @GET("Noticia/")
    Call<Respuesta<Noticia>> getNoticias();

    @GET("Promocion/")
    Call<Respuesta<Promocion>> getPromociones();

    @GET("SucursalObject/")
    Call<Respuesta<Sucursal>> getSucursales();

    @GET("Ley/")
    Call<Respuesta<Ley>> getLeyes();

    @GET("Categoria/")
    Call<Respuesta<Categoria>> getCategorias();

    @GET("Cliente/")
    Call<Respuesta<Cliente>> getClientes(@Query("IdRed") String IdRed);

    @POST("Cliente/")
    Call<Cliente> guardarCliente(@Body Cliente datos);

    // TODO falta servicio
    @POST("/")
    Call<Cliente> canjearProducto(@Body Cliente datos);

    @GET("Contactanos/")
    Call<Respuesta<Contacto>> getContacto();

    @GET("Contactanos/1/sendMail")
    Call<Respuesta<Sugerencia>> enviarSugerencia(
            @Query("subject") String subject,
            @Query("body") String body);

    @GET("AboutPage/")
    Call<Respuesta<About>> getAbout();

    @GET("SiteConfig/")
    Call<Respuesta<Sugerencia>> getSiteConfig();*/


}