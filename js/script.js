
function  showInput() {
    document.getElementById("inputAcercaDe").style.display="block";
}

function updAcercaDe() {
    document.getElementById("acercaDe").innerHTML=document.getElementById("inputAcercaDe").value;
}

function  showInput1() {
    document.getElementById("inputTutora").style.display="block";
}

function updTutora() {
    document.getElementById("tutora").innerHTML=document.getElementById("inputTutora").value;
}


function  showInput2() {
    document.getElementById("inputUNSa").style.display="block";
}

function updUNSa() {
    document.getElementById("unsa").innerHTML=document.getElementById("inputUNSa").value;
}

function  showInput3() {
    document.getElementById("inputCursoJava").style.display="block";
}

function updCursoJava() {
    document.getElementById("cursoJava").innerHTML=document.getElementById("inputCursoJava").value;
}

function  showInput4() {
    document.getElementById("inputCursoPython").style.display="block";
}

function updCursoPython() {
    document.getElementById("cursoPython").innerHTML=document.getElementById("inputCursoPython").value;
}

function  showInput5() {
    document.getElementById("inputAptitudes1").style.display="block";
}

function updAptitudes1() {
    document.getElementById("aptitudes1").innerHTML=document.getElementById("inputAptitudes1").value;
}

function  showInput6() {
    document.getElementById("inputAptitudes2").style.display="block";
}

function updAptitudes2() {
    document.getElementById("aptitudes2").innerHTML=document.getElementById("inputAptitudes2").value;
}

function  showInput7() {
    document.getElementById("inputProyecto1").style.display="block";
}

function updProyecto1() {
    document.getElementById("proyecto1").innerHTML=document.getElementById("inputProyecto1").value;
}

function  showInput8() {
    document.getElementById("inputProyecto2").style.display="block";
}

function updProyecto2() {
    document.getElementById("proyecto2").innerHTML=document.getElementById("inputProyecto2").value;
}

const exampleModal = document.getElementById('exampleModal')
exampleModal.addEventListener('show.bs.modal', event => {
  // Button that triggered the modal
  const button = event.relatedTarget
  // Extract info from data-bs-* attributes
  const recipient = button.getAttribute('data-bs-whatever')
  // If necessary, you could initiate an AJAX request here
  // and then do the updating in a callback.
  //
  // Update the modal's content.
  const modalBodyInput = exampleModal.querySelector('.modal-body input')

  modalBodyInput.value = recipient
})

/**
 * Elimina un item de la página
 * No guarda la información en la db, es solo front-end
 */
function  eliminarItem(idItem) {
    console.log(idItem)
    console.log(document.getElementById(idItem))
    document.getElementById(idItem).className="d-none"
    //todo: ocular el modal myModal para cerrarlo
    const myModal = new bootstrap.Modal(document.getElementById('exampleModal'))


}

const exampleModal1 = document.getElementById('exampleModal1')
exampleModal1.addEventListener('show.bs.modal', event => {
  const button = event.relatedTarget
  const recipient = button.getAttribute('data-bs-whatever')
  const modalBodyInput = exampleModal1.querySelector('.modal-body input')

  modalBodyInput.value = recipient
})
function  eliminarItem1(idItem) {
    console.log(idItem)
    console.log(document.getElementById(idItem))
    document.getElementById(idItem).className="d-none"
    //todo: ocular el modal myModal para cerrarlo
    const myModal = new bootstrap.Modal(document.getElementById('exampleModal1'))


}

const exampleModal2 = document.getElementById('exampleModal2')
exampleModal2.addEventListener('show.bs.modal', event => {
  const button = event.relatedTarget
  const recipient = button.getAttribute('data-bs-whatever')
  const modalBodyInput = exampleModal2.querySelector('.modal-body input')
  modalBodyInput.value = recipient
})
function  eliminarItem2(idItem) {
    console.log(idItem)
    console.log(document.getElementById(idItem))
    document.getElementById(idItem).className="d-none"
    const myModal = new bootstrap.Modal(document.getElementById('exampleModal2'))


}

const exampleModal3 = document.getElementById('exampleModal3')
exampleModal3.addEventListener('show.bs.modal', event => {
  const button = event.relatedTarget
  const recipient = button.getAttribute('data-bs-whatever')
  const modalBodyInput = exampleModal3.querySelector('.modal-body input')
  modalBodyInput.value = recipient
})
function  eliminarItem3(idItem) {
    console.log(idItem)
    console.log(document.getElementById(idItem))
    document.getElementById(idItem).className="d-none"
    const myModal = new bootstrap.Modal(document.getElementById('exampleModal3'))


}

const exampleModal4 = document.getElementById('exampleModal4')
exampleModal4.addEventListener('show.bs.modal', event => {
  const button = event.relatedTarget
  const recipient = button.getAttribute('data-bs-whatever')
  const modalBodyInput = exampleModal4.querySelector('.modal-body input')
  modalBodyInput.value = recipient
})
function  eliminarItem4(idItem) {
    console.log(idItem)
    console.log(document.getElementById(idItem))
    document.getElementById(idItem).className="d-none"
    const myModal = new bootstrap.Modal(document.getElementById('exampleModal4'))


}

const exampleModal5 = document.getElementById('exampleModal5')
exampleModal5.addEventListener('show.bs.modal', event => {
  const button = event.relatedTarget
  const recipient = button.getAttribute('data-bs-whatever')
  const modalBodyInput = exampleModal5.querySelector('.modal-body input')
  modalBodyInput.value = recipient
})
function  eliminarItem5(idItem) {
    console.log(idItem)
    console.log(document.getElementById(idItem))
    document.getElementById(idItem).className="d-none"
    const myModal = new bootstrap.Modal(document.getElementById('exampleModal5'))


}

const exampleModal6 = document.getElementById('exampleModal6')
exampleModal6.addEventListener('show.bs.modal', event => {
  const button = event.relatedTarget
  const recipient = button.getAttribute('data-bs-whatever')
  const modalBodyInput = exampleModal6.querySelector('.modal-body input')
  modalBodyInput.value = recipient
})
function  eliminarItem6(idItem) {
    console.log(idItem)
    console.log(document.getElementById(idItem))
    document.getElementById(idItem).className="d-none"
    const myModal = new bootstrap.Modal(document.getElementById('exampleModal6'))


}

const exampleModal7 = document.getElementById('exampleModal7')
exampleModal7.addEventListener('show.bs.modal', event => {
  const button = event.relatedTarget
  const recipient = button.getAttribute('data-bs-whatever')
  const modalBodyInput = exampleModal7.querySelector('.modal-body input')
  modalBodyInput.value = recipient
})
function  eliminarItem7(idItem) {
    console.log(idItem)
    console.log(document.getElementById(idItem))
    document.getElementById(idItem).className="d-none"
    const myModal = new bootstrap.Modal(document.getElementById('exampleModal7'))


}