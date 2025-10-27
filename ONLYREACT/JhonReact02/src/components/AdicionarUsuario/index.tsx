import { useState } from "react";
import "./style.css";

function AdicionarUsuario() {

    const [nome, setNome] = useState('');
    const [email, setEmail] = useState('');

    const [usuarios, setUsuarios] = useState([])

    const handleAdicionar = (event) => {
        event.preventDefault();
        if (nome && email) {
            setUsuarios([...usuarios, { nome, email }]);
            setNome('');
            setEmail('');
        }
    
    }


    return (
        <div className="container">

            <div className="container-main">
                <h1>Jhon Dev!</h1>
            </div>

            <h2>Adicionar Usuario</h2>
            <form onSubmit={handleAdicionar}>
                <input 
                    type="text" 
                    placeholder="Nome"
                    value={nome}
                    onChange={(e) => setNome(e.target.value)}
                />
                <input 
                    type="email" 
                    placeholder="Email"
                    value={email}
                    onChange={(e) => setEmail(e.target.value)}
                />
                <button type="submit">Adicionar</button>
            </form>

            <hr />

            <h3>Usuarios Adicionados</h3>
            <ul>
                {usuarios.map((usuario, index) => (
                    <li key={index}>
                        {usuario.nome} - {usuario.email}
                    </li>
                ))}
            </ul>
        </div>
    ) 
}

export default AdicionarUsuario;
