//src\components\InfoAluno\index.jsx

import { useState } from "react";
import './style.css';


function InfoAluno() {

    // const nome = "Jhon Doe";
    // const idade = 21;
    // const curso = "Desenvolvimento Web";    

    // eslint-disable-next-line no-unused-vars
    const [nome, setNome] = useState("Jhon Doe");
    // eslint-disable-next-line no-unused-vars
    const [curso, setCurso] = useState("Desenvolvimento Web");
    // eslint-disable-next-line no-unused-vars
    const [idade, setIdade] = useState(21);


    return (
        <div className='TelaAluno'>
            <h2>informações do Aluno</h2>
            <p>Nome: {nome}</p>
            <p>Idade: {idade}</p>
            <p>Curso: {curso}</p>
        </div>
    );
}

export default InfoAluno;