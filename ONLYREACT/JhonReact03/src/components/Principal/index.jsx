import { useState } from 'react';
import './style.css'

function Principal() {

    const [nome, setNome] = useState("");
    const [telefone, setTelefone] = useState("");
    const [funcionarios, setFuncionarios] = useState([]);

    const handleSubmit = (e) => {
        e.preventDefault();
        setFuncionarios([...funcionarios, { nome, telefone }]);
        setNome("");
        setTelefone("");
    }

    return (
        
        <div className="containerMain">
            <div className="formMain">
                <h1>Criar Funcionario</h1>

                <form onSubmit={handleSubmit} >
                    <label htmlFor='Nome'>Nome:</label>
                    <input 
                        type="text" 
                        id='Nome'
                        value={nome} 
                        onChange={(e) => setNome(e.target.value)} 
                    />
                    <label htmlFor='telefone'>Telefone:</label>
                    <input 
                        type="text" 
                        id='telefone'
                        value={telefone} 
                        onChange={(e) => setTelefone(e.target.value)} 
                    />

                    <button type="submit">Salvar</button>
                </form>

            </div>

            <div className="listMain">
                <h2>Lista de Funcionarios</h2>
                <ul>
                    {funcionarios.map((funcionario, index) => (
                        <li key={index}>
                            {funcionario.nome} - {funcionario.telefone}
                        </li>
                    ))}
                    
                </ul>
            </div>
        </div>
    )
}

export default Principal