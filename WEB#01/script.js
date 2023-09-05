function openModal(){
    const modal = document.getElementById('janela-modal')
    modal.classList.add('mostrar')

    modal.addEventListener('click', (e) =>{
        if (e.target.id == 'janela-modal' || e.target.id == "fechar"){
            modal.classList.remove('mostrar')
            localStorage.fechaModal = 'janela-modal'
        }
    })
}