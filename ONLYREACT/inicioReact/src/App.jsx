import './App.css'
import InfoAluno from './components/InfoAluno'
import InfoCurso from './components/InfoCurso'
import Mensagem from './components/Mensagem'

function App() {

  return (
    <>
      <div className='TelaPrincipal'>
        <h1>Jhon Developer</h1>
      </div>
      <Mensagem />
      <InfoAluno />
      <InfoCurso />
    </>
  )
}

export default App
