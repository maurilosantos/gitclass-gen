const nome = document.getElementById('nome');
const email = document.querySelector('#email');
const textarea = document.getElementById("texto");
const contador = document.getElementById("contador");



//validando o email: 
function validaEmail () {
  let txtEmail = document.querySelector('#txtEmail')
  if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1){ 
      txtEmail.innerHTML = 'E-mail inválido'
      email.style.color = 'red'
      email.style.border='3px solid red'
  } else {
      txtEmail.innerHTML = 'E-mail válido'
      email.style.color = 'green'
      email.style.border='3px solid green'
      emailOk = true
  }
  }

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