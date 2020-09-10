CREATE PROCEDURE spr_Transacciones
AS
SELECT idTransaccion, fecha as Fecha, v.nombreCompleto as Vendedor, o.Operacion as Operacion, i.Inmueble as Inmueble, monto as Monto
FROM Transacciones t
INNER JOIN Vendedores v
ON  t.idVendedor = v.IdVendedor
INNER JOIN Operaciones o
ON t.IdOperacion = o.IdOperacion
INNER JOIN Inmuebles i
ON t.IdInmueble = i.IdInmueble;

CREATE PROCEDURE spr_MayorTransaccion
AS
SELECT idTransaccion, fecha as Fecha, v.nombreCompleto as Vendedor, o.Operacion as Operacion, i.Inmueble as Inmueble, monto as Monto
FROM Transacciones t
INNER JOIN Vendedores v
ON  t.idVendedor = v.IdVendedor
INNER JOIN Operaciones o
ON t.IdOperacion = o.IdOperacion
INNER JOIN Inmuebles i
ON t.IdInmueble = i.IdInmueble
WHERE monto = (SELECT max(monto) FROM Transacciones) AND o.IdOperacion = 2;

CREATE PROCEDURE spr_TransaccionOficina
AS
SELECT idTransaccion, fecha as Fecha, v.nombreCompleto as Vendedor, o.Operacion as Operacion, i.Inmueble as Inmueble, monto as Monto
FROM Transacciones t
INNER JOIN Vendedores v
ON  t.idVendedor = v.IdVendedor
INNER JOIN Operaciones o
ON t.IdOperacion = o.IdOperacion
INNER JOIN Inmuebles i
ON t.IdInmueble = i.IdInmueble
WHERE i.IdInmueble = 1