//llama los datos del usuario de un api y los imprime en el html
//corregi el fetch, los backticks, la connexion, y la llamada al mensaje de error, tambien cambie a innerText y agregue el campo para data.location, asegurandome que estuviera llamando a la clase con .
//

const baseEndpoint = 'https://api.github.com';
const usersEndpoint = `${baseEndpoint}/users`;
const $n = document.querySelector('.name');
const $b = document.querySelector('.blog');
const $l = document.querySelector('.location');


function displayUser(username) {
  let promesa =  fetch(`${usersEndpoint}/${username}`,{
    method:"GET"});
  promesa.then((response)=>{
    response.json().then((data)=>{
      $n.innerText = `${data.name}`;
      $b.innerText = `${data.blog}`;
      $l.innerText = `${data.location}`;
    }).catch((error)=>{
      handleError(error);
    })
  }).catch((error)=>{
    handleError(error);
  });
}

function handleError(err) {
  console.log('OH NO!');
  console.log(err);
  n.textContent = `Algo salió mal: ${err}`
}

displayUser('stolinski');