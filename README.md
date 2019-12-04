# RealTech
Paso entre activitys

Login -> Catalog -> Shopping Car -> (Realizar Compra)
      -> Sing Up                 
      -> Recover	

-----------------------------------------------------------------------------------------------------------
Navigation Bar -> Catalog
               -> Shopping Car
	       -> Exit
-----------------------------------------------------------------------------------------------------------
Todos los contenidos estan en los archivos content_(nombre de activity) 
Los archivos fragments_ posiblemente no se usen


Para el catalog y shopping se usara recyclerview y cardview catalog tendra su cardview personalizado (card_item_catalog) y shopping_car (card_item_car)

CatalogActivity ya agrega cardview's en su recyclerview dinamicamente por medio de la clase Adapter falta un adapter para shopping_car

Todos los datos necesarios para los cardview deben estar en la clase Item

------------------------------------------------------------------------------------------------------------
Implementar 
-navigation bar
-luego de login o sing up(mostrar datos en la barra de navegacion) 
-cada boton agragar de los cardview del catalogo debe agregar los respectivos cardview al shopping car
-mostrar un fragment o pantalla emergente al apreta en detalles del cardview del catalog
-en shopping car mostrar el numero de productos del mismo tipo asi como el precio total de este y de todos los productos juntos
............................................................................................................................

Notas:
Se usa api de android 17 para arriba
No se migro a androidx ni se agrego librerias manualmente
------------------------------------------------------------------------------------------------
Videos:
https://www.youtube.com/watch?v=3HRqe_t2Spk (Como agregar un recyclerview con cardview en Android Studio)
https://www.youtube.com/watch?v=hVtITQwhjro&list=PLNsrKfI1eX90M7y-kzGMAVF26r3RTFlji&index=4&t=344s  (Spinner Personalizado - Android Studio)
