<%@page contentType="text/html" pageEncoding="UTF-8" %>
<%@taglib uri ="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="layout/header.jsp" />
    <div class="row">
        <div class="col-12">
            <h4> Ejemplo de Factura: Inyeccion de dependecias </h4>
        </div>
    </div>

    <div class="row">
        <div class="col-12">
            <ul class="list-group">
              <li class="list-group-item active" aria-current="true">Factura: ${factura.numeroFactura}</li>
              <li class="list-group-item">${factura.descripcion}</li>
              <li class="list-group-item">${factura.cliente.nombre}</li>
            </ul>
        </div>
    </div>

    <div class="row">
        <div class="col-12">
            <table class="table table-striped">
                <thead>
                    <tr>
                        <th scope="col">Producto</th>
                        <th scope="col">Cantidad</th>
                        <th scope="col">Total</th>
                    </tr>
                </thead>

                <tbody class="table-group-divider">
                    <c:forEach items="${factura.lineaFacturas}" var="l">
                        <tr>
                            <td>${l.nombreProducto}</td>
                            <td>${l.cantidad}</td>
                            <td>${l.precio}</td>
                        </tr>
                    </c:forEach>
                </tbody>

            </table>
        </div>
    </div>
            <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.7/dist/umd/popper.min.js" integrity="sha384-zYPOMqeu1DAVkHiLqWBUTcbYfZ8osu1Nd6Z89ify25QV9guujx43ITvfi12/QExE" crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.min.js" integrity="sha384-Y4oOpwW3duJdCWv5ly8SCFYWqFDsfob/3GkgExXKV4idmbt98QcxXYs9UoXAB7BZ" crossorigin="anonymous"></script>

<jsp:include page="layout/footer.jsp" />
