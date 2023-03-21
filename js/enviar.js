$(document).ready(function() {
    $('#listar').on('click',function() {

        let tabla = document.querySelector('#tabla')
        tabla.innerHTML = '<table><tr><th>ID</th><th>NOMBRE</th><th>PAÍS</th><th>FECHA NACIMIENTO</th><th>CORREO</th></tr></table>'

        $.ajax({

            url:"http://localhost:8080/listarUsuario",
            type:"GET",
            dataType: "JSON",
            success: function(respuesta) {
                for (i = 0;i <= respuesta.length; i++){
                    tabla.innerHTML += 
                    '<tr><td>' + respuesta[i].idUsuario +
                    '<td>' + respuesta[i].nombreUsu +
                    '<td>' + respuesta[i].pais +
                    '<td>' + respuesta[i].fechaNac +
                    '<td>' + respuesta[i].correoUsu
                }
            }
        })
    })
});

$('#enviar').on('click',function(){
    let datos = {
        id: parseInt($('#idUsuario').val()),
        nomUsuario: $('#nomUsuario').val(),
        paisUsu: $('#paisUsu').val(),
        fechaNa: $('#fechaNac').val(),
        CorrUsu: $('#CorrUsu').val()
    }
    console.log(datos)

    let datosEnvio = JSON.stringify(datos);
    console.log(datosEnvio);
    $.ajax({
        url: "http://localhost:8080/agregarUsuario",
        type: "POST",
        data: datosEnvio,
        contentType: "application/JSON",
        dataType: "JSON",
        success: function(respuesta) {
            alert(respuesta)
        }
    })
});

$('#buscarId').on('click',function(){
    let codigo = $('#codigo').val();

    let tabla = document.querySelector('#tabla')
    tabla.innerHTML = '<table><tr><th>ID</th><th>NOMBRE</th><th>PAÍS</th><th>FECHA NACIMIENTO</th><th>CORREO</th></tr></table>'

    $.ajax({
        url:"http://localhost:8080/buscarUsuario/"+codigo,
        Type:"GET",
        dataType:"JSON",
        success:function(respuesta){
            if(respuesta==null){
                alert("No se encontro el usuario.")
            }else{
                console.log(respuesta)
                for (i = 0;i <= respuesta.length; i++){
                    tabla.innerHTML += 
                    '<tr><td>' + respuesta[i].idUsuario +
                    '<td>' + respuesta[i].nombreUsu +
                    '<td>' + respuesta[i].pais +
                    '<td>' + respuesta[i].fechaNac +
                    '<td>' + respuesta[i].correoUsu
                }
            }
        }
    })
});