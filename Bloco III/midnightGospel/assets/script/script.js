const nome = document.getElementById('nome');
const email = document.querySelector('#email');
const textarea = document.getElementById("texto");
const contador = document.getElementById("contador");

nome.indexOf

function validaNome() {
    let txtNome = document.querySelector('#txtNome');
    console.log(nome.value);
if(nome.value.length < 2) {
    txtNome.innerHTML = 'Nome invalido'
    txtNome.style.color = 'red'
    nome.style.border='3px solid red'
    } else {
    txtNome.innerHTML = 'Nome valido'
    txtNome.style.color = 'green'
    nome.style.border='3px solid green'
    }
}

textarea.addEventListener("input", function() {
    const texto = textarea.value;
    const numeroCaracteres = texto.length;
  
    if (numeroCaracteres <= 100) {
      contador.innerText = numeroCaracteres + "/100 caracteres";
    } else {
      textarea.value = texto.substring(0, 100);
      contador.innerText = "Limite de 100 caracteres atingido";
    }
  });