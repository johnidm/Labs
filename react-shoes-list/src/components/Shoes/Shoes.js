import "./Shoes.css";
import ShoesItem from './ShoesItem';

const Shoes = (props) =>  {
    const items = props.items;

    return (
        <div className="shoes">
            <ShoesItem item={items[0]} /> 
            <ShoesItem item={items[1]} /> 
            <ShoesItem item={items[2]} /> 
        </div>
    )
}

export default Shoes;