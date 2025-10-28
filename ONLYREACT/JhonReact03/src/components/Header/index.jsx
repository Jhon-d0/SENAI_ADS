import "./style.css";

export function Header() {
    return (
        <div className="header">
            <div className="boxHeaderLeft">
                <img src="../../../public/logo.png" alt="logo" />
            </div>

            <div className="boxHeaderRight">
                <nav>
                    <ul>
                        <li>
                            <a href="">Home</a>
                        </li>
                        <li>
                            <a href="">Conteudo</a>
                        </li>
                        <li>
                            <a href="">Perfil</a>
                        </li>
                    </ul>
                </nav>
            </div>
        </div>
    )
}

export default Header;