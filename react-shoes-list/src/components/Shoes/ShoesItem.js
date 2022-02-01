import "./ShoesItem.css";

const ShoesItem = (props) => { 

    return (
        <p className="shoes-item">{props.item.type}</p>
    )
}

export default ShoesItem;