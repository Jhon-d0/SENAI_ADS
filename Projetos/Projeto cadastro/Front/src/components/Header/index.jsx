import "./style.css";
import { Link } from "react-router-dom";

export default function Header() {

    return (
        <header className="header">

            <div className="container">
                <nav>
                    <ul>
                        <li><Link to="/">Home</Link></li>
                        <li><Link to="/cadastro">Cadastro</Link></li>
                        <li><Link to="/usuarios">Lista Usuario</Link></li>
                    </ul>
                </nav>
            </div>
            
        </header>
    )
}