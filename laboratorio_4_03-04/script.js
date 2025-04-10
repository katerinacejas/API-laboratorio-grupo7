async function fetchUsuarios() {
    const response = await fetch('https://reqres.in/api/users?page=1');
    const data = await response.json();
    renderUsers(data.data);
}

function renderUsers(usuarios) {
    const listaUsuarios = document.getElementById("listaUsuarios");
    listaUsuarios.innerHTML = "";

    usuarios.forEach(usuario => {
        const item = document.createElement("li");
        item.innerHTML = `
            <img src="${usuario.avatar}" alt="${usuario.first_name}" width="50">
            <strong>${usuario.first_name} ${usuario.last_name}</strong> - ${usuario.email}
        `;
        listaUsuarios.appendChild(item);
    });
}

fetchUsuarios();

let inputBuscar = document.getElementById("filtroNombres")

boton_buscar.addEventListener("click", () => {
    
});