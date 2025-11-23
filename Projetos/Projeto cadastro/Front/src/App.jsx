import './App.css'
import { Route, Routes } from 'react-router-dom'

import Header from './components/Header'
import Footer from './components/Footer'
import HomePage from './pages/HomePage'
import CadastroPage from './pages/CadastroPage'
import ListaUsuarioPage from './pages/ListaUsuarioPage'
import { ToastContainer } from 'react-toastify'

function App() {

  return (
    <>
      <Header/>
      <main>
        <Routes>
          <Route path='/' element={<HomePage/>}/>
          <Route path='/cadastro' element={<CadastroPage/>}/>
          <Route path='/usuarios' element={<ListaUsuarioPage/>}/>
        </Routes>
      </main>
      <Footer/>
      <ToastContainer position='top-right' autoClose={3000} />
    </>
  )
}

export default App