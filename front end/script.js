const formulario = document.querySelector("form");
const Inome = document.querySelector(".nome");
const Iemail = document.querySelector(".email");
const Isenha = document.querySelector(".senha");
const Itel = document.querySelector(".tel");

function cadastrar() {
    fetch("http://localhost:8081/usuarios", {
        method: "POST",
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify({
            nome: Inome.value,
            email: Iemail.value,
            senha: Isenha.value,
            telefone: Itel.value
        })
    })
    .then(function (res) {
        if (!res.ok) {
            throw new Error('Erro ao cadastrar usuário.');
        }
        return res.json(); // Retorna os dados do servidor se houver uma resposta JSON
    })
    .then(function (data) {
        console.log('Cadastro realizado com sucesso:', data);
        limpar(); // Limpa os campos após o cadastro bem-sucedido
    })
    .catch(function (error) {
        console.error('Erro:', error);
    });
}

function limpar() {
    Inome.value = "";
    Iemail.value = "";
    Isenha.value = "";
    Itel.value = "";
}

formulario.addEventListener('submit', function (event) {
    event.preventDefault();
    cadastrar();
});
