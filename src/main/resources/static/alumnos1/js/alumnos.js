$(document).ready(function() {
	
	//Cargamos la lista de alumnos en la tabla
    $('#gridAlumnos').DataTable({
        "ajax": "data/alumnos.json",
        "columns": [
            { "data": "apellidos" },
            { "data": "nombre" },
            { "data": "sexo" },
            { "data": "edad" },
            { "data": "nacionalidad" }
        ],
		language: {
			url: 'locale/es_ES.json'
		}
    });
});