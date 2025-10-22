//src\components\InfoCurso\index.jsx

import { useState } from "react";
import './style.css';


function InfoCurso() {

    // eslint-disable-next-line no-unused-vars
    const [nome, setNome] = useState("React Básico");
    // eslint-disable-next-line no-unused-vars
    const [dadosDoCurso, setDadosDoCurso] = useState("Curso introdutório de React.js para iniciantes");
    // eslint-disable-next-line no-unused-vars
    const [cargarHoraria, setCargaHoraria] = useState("40 horas");
    // eslint-disable-next-line no-unused-vars
    const [local, setLocal] = useState("Online");
    // eslint-disable-next-line no-unused-vars
    const [dataInicio, setDataInicio] = useState("2025-11-01");
    // eslint-disable-next-line no-unused-vars
    const [dataTermino, setDataTermino] = useState("2025-12-01");


    return (
        <div className='TelaCurso'>
            <h2>Informações do Curso</h2>
            <p>Dados do curso: {dadosDoCurso}</p>
            <p>Nome: {nome}</p>
            <p>Carga Horaria: {cargarHoraria}</p>
            <p>Local: {local}</p>
            <p>Data Inicio: {dataInicio}</p>
            <p>Data Termino: {dataTermino}</p>
        </div>
    );
}

export default InfoCurso;