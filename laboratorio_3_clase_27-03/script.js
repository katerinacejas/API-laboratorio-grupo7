let calculo = 0;

let primero = parseInt(document.getElementById("primero").value);
let segundo = parseInt(document.getElementById("segundo").value);

const botonSuma = document.getElementById("sumar");
const botonResta = document.getElementById("restar");
const botonMulti = document.getElementById("multiplicar");
const resultado = document.getElementById("resultado");

botonSuma.addEventListener("click", () => {
   calculo = primero + segundo;
   resultado.innerText = calculo;
});

botonResta.addEventListener("click", () => {
   calculo = primero - segundo;
   resultado.innerText = calculo;
});

botonMulti.addEventListener("click", () => {
   calculo = primero * segundo;
   resultado.innerText = calculo;
});